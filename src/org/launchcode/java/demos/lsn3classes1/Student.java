package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public String getStudentName() {
        return name;
    }
    public void setStudentName(String aName) {
        name = aName;
    }
    public int getStudentNId() {
        return studentId;
    }
    public void setStudentId(int anIdNum) {
        studentId = anIdNum;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public double getStudentGpa() {
        return gpa;
    }
    private void setStudentGpa(double aGpa) {
        gpa = aGpa;
    }

}
