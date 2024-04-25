package Hospital;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PatientGUI extends JFrame {

    private JTextField nameField, ageField, genderField;
    private JTextArea medicalRecordArea;
    private JButton addRecordButton;

    public PatientGUI() {
        setTitle("Hospital Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));
        add(panel);

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);
        nameField = new JTextField();
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        panel.add(ageLabel);
        ageField = new JTextField();
        panel.add(ageField);

        JLabel genderLabel = new JLabel("Gender:");
        panel.add(genderLabel);
        genderField = new JTextField();
        panel.add(genderField);

        JLabel medicalRecordLabel = new JLabel("Medical Record:");
        panel.add(medicalRecordLabel);
        medicalRecordArea = new JTextArea();
        panel.add(new JScrollPane(medicalRecordArea));

        addRecordButton = new JButton("Add Medical Record");
        panel.add(addRecordButton);
        addRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMedicalRecord();
            }
        });

        setVisible(true);
    }

    private void addMedicalRecord() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String gender = genderField.getText();
        String medicalRecord = medicalRecordArea.getText();

        // Here you can perform operations with the collected data, such as adding to a database or processing further.
        // For now, let's just print the collected data.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Medical Record: " + medicalRecord);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PatientGUI();
            }
        });
    }
}
