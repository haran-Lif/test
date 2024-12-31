import javax.swing.*;
import java.awt.*;
// UI 구성 요소 생성


public class ScreenFactory {
    public static JPanel createSelectionScreen(ScreenManager manager) {
        JPanel panel = new JPanel(new GridLayout(3, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        for (int i = 1; i <= 12; i++) {
            JButton button = new JButton("Option " + i);
            button.addActionListener(e -> manager.showScreen("Calculator"));
            panel.add(button);
        }
        return panel;
    }

    public static JPanel createCalculatorScreen() {
        JPanel panel = new JPanel(new BorderLayout());

        InputPanel inputPanel = new InputPanel();
        CalculatorPanel calculatorPanel = new CalculatorPanel(inputPanel);

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(inputPanel, BorderLayout.CENTER);
        leftPanel.setPreferredSize(new Dimension(500, 600));

        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(calculatorPanel, BorderLayout.CENTER);

        return panel;
    }
}
