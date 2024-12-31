import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    public InputPanel() {
        setLayout(new GridLayout(23, 2, 5, 5));
        String[] labels = {"DEX", "LUK", "POW", "VIT", "INT", "Weapon ATK", "ATK/MATK +", "ATK/MATK %", "Size",
                "Attribute", "Race", "Grade", "Specific Mob", "Magic/Elemental", "S MATK", "Heal Amount", "H Plus",
                "Received Heal", "HP", "SP", "HP %", "SP %", "Skill Damage"};

        for (String label : labels) {
            JLabel jLabel = new JLabel(text;);
            JLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(JLabel);

            JTextField textField = new JTextField(label);
            textField.setHorizontalAlignment(SwingConstants.CENTER);
            add(new JTextField());
        }
    }
}
