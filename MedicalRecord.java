package Hospital;

import java.util.Date;
public class MedicalRecord {
    private String record;
    private Date date;
    private String staffName;
    private String recordType;
    private String severityLevel;
    private String additionalInfo;

    public MedicalRecord(String record, Date date, String staffName, String recordType, String severityLevel, String additionalInfo) {
        this.record = record;
        this.date = date;
        this.staffName = staffName;
        this.recordType = recordType;
        this.severityLevel = severityLevel;
        this.additionalInfo = additionalInfo;
    }

    // Getters and setters
    // You can add more methods as needed
}
