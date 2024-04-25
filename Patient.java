package Hospital;
import java.util.ArrayList;//This line imports the ArrayList class from the java.util package.
import java.util.List;
public class Patient {
    //Instance variables
    private String name;
    private int age;
    private String gender;
    private List<MedicalRecord> medicalRecords;

    //constructor
    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        medicalRecords = new ArrayList<>();
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
    }

    // Getters and setters
    // You can add more methods as needed
}
