import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VolumeOfScetionOfSphere extends JFrame implements ActionListener {
    private JTextField radiusField;
    private JTextField heightField;
    private JTextField resultField;

    public VolumeOfScetionOfSphere() {
        setTitle("Volume Of Section Calculator: ");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the components
        JLabel radiusLabel = new JLabel("Radius:");
        radiusField = new JTextField(10);
        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        JLabel resultLabel = new JLabel("Volume");
        resultField = new JTextField("0",12);
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Use GridBagLayout for more precise control
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(15, 15, 15, 15); // Add spacing between components

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(radiusLabel, constraints);

        constraints.gridx = 1;
        panel.add(radiusField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(heightLabel, constraints);

        constraints.gridx = 1;
        panel.add(heightField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(calculateButton, constraints);

        constraints.gridy = 3;
        panel.add(resultField, constraints);

        constraints.gridy = 4;
        panel.add(resultField, constraints);
        resultField.setEditable(false);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(resultLabel,constraints);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {

            double radius = Double.parseDouble(radiusField.getText());
            double height = Double.parseDouble(heightField.getText());

            double volume = (2.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

            resultField.setText(String.valueOf(volume));
            resultField.setCaretPosition(0);
        }
    }
}