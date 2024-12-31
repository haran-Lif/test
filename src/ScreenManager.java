import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
// 화면 전환 관리

public class ScreenManager {
    private CardLayout cardLayout;
    private JPanel container;
    private Map<String, JPanel> screens;

    public ScreenManager() {
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);
        screens = new HashMap<>();
    }

    public void addScreen(String name, JPanel screen) {
        screens.put(name, screen);
        container.add(screen, name);
    }

    public void showScreen(String name) {
        cardLayout.show(container, name);
    }

    public JPanel getContainer() {
        return container;
    }
}
