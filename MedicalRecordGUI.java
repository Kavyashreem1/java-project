package Hospital;
import javax.swing.*;
import java.awt.*;//Provide classes to create GUI
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//Clicking th button
import java.util.Date;

public class MedicalRecordGUI extends JFrame {

    private JTextField recordField, staffNameField, recordTypeField, severityLevelField, additionalInfoField;
    private JTextArea medicalRecordArea;
    private JButton addRecordButton;
    private boolean recordAdded = false;

    public MedicalRecordGUI() {
        setTitle("Medical Record Management System");//Set GUI window
        setSize(400, 400);//Sets the size of GUI window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//When we click the close button GUI window will exit
        setLocationRelativeTo(null);//GUI window will appear in middle

        JPanel panel = new JPanel(new GridLayout(7, 2));
        add(panel);

        JLabel recordLabel = new JLabel("Medical Record:");
        panel.add(recordLabel);
        recordField = new JTextField();
        panel.add(recordField);

        JLabel staffNameLabel = new JLabel("Staff Name:");
        panel.add(staffNameLabel);
        staffNameField = new JTextField();
        panel.add(staffNameField);

        JLabel recordTypeLabel = new JLabel("Record Type:");
        panel.add(recordTypeLabel);
        recordTypeField = new JTextField();
        panel.add(recordTypeField);

        JLabel severityLevelLabel = new JLabel("Severity Level:");
        panel.add(severityLevelLabel);
        severityLevelField = new JTextField();
        panel.add(severityLevelField);

        JLabel additionalInfoLabel = new JLabel("Additional Info:");
        panel.add(additionalInfoLabel);
        additionalInfoField = new JTextField();
        panel.add(additionalInfoField);

        addRecordButton = new JButton("Add Medical Record");
        panel.add(addRecordButton);
        addRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!recordAdded) {
                    addMedicalRecord();
                    recordAdded = true;
                }
            }
        });

        medicalRecordArea = new JTextArea();
        panel.add(new JScrollPane(medicalRecordArea));

        setVisible(true);
    }

    private void addMedicalRecord() {
        String record = recordField.getText();
        String staffName = staffNameField.getText();
        String recordType = recordTypeField.getText();
        String severityLevel = severityLevelField.getText();
        String additionalInfo = additionalInfoField.getText();

        // Current date and time
        Date recordDate = new Date();

        // Display the added medical record in the medical record area
        medicalRecordArea.append("Medical Record: " + record + "\n");
        medicalRecordArea.append("Date: " + recordDate.toString() + "\n");
        medicalRecordArea.append("Staff Name: " + staffName + "\n");
        medicalRecordArea.append("Record Type: " + recordType + "\n");
        medicalRecordArea.append("Severity Level: " + severityLevel + "\n");
        medicalRecordArea.append("Additional Info: " + additionalInfo + "\n\n");

        // Clear input fields
        clearFields();
    }

    private void clearFields() {
        recordField.setText("");
        staffNameField.setText("");
        recordTypeField.setText("");
        severityLevelField.setText("");
        additionalInfoField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MedicalRecordGUI();
            }
        });
    }
}
