import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // MainFrame 호출만 담당
            MainFrame mainFrame = new MainFrame();
        });
    }
}
