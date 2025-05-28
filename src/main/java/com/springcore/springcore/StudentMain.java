package com.springcore.springcore;

public class StudentMain {

    private String studentName;
    private int studentId;
    private String studentAddress;  

    // ✅ Correct Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {  // ✅ Correct Setter Name
        this.studentName = studentName;
    }

    // ✅ Correct Getter and Setter for studentId
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // ✅ Correct Getter and Setter for studentAddress
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) { 
        this.studentAddress = studentAddress;
    } 

    // Default Constructor
    public StudentMain() {
        super();
    }

    // Parameterized Constructor
    public StudentMain(String studentName, int studentId, String studentAddress) {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    // ✅ To Check Output
    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + studentName + ", Address=" + studentAddress + "]";
    }
}
