import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Main Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // UI 관리 객체 호출
        ScreenManager screenManager = new ScreenManager();

        // 선택 화면 추가
        screenManager.addScreen("Selection", ScreenFactory.createSelectionScreen(screenManager));

        // 계산기 화면 추가
        screenManager.addScreen("Calculator", ScreenFactory.createCalculatorScreen());

        // 화면 전환 컨테이너 추가
        add(screenManager.getContainer(), BorderLayout.CENTER);

        // 초기 화면 설정
        screenManager.showScreen("Selection");

        setSize(1100, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
