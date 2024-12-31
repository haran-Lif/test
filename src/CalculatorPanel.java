import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {
    public CalculatorPanel(InputPanel inputPanel) {
        setLayout(new GridLayout(6, 2, 5, 5));
        String[] labels = {"Result A", "Result B", "Result C", "Result D", "Result E", "Result F"};

        for (String label : labels) {
            add(new JLabel(label + ":"));
            add(new JTextField());
        }

        inputPanel.getComponent(0).addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                System.out.println("Input data processed.");
            }
        });
    }
}