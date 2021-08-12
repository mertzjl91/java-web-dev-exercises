package org.launchcode.java.demos.lsn4classes2;
//import org.launchcode.java.demos.lsn4classes2.Teacher;
//import org.launchcode.java.demos.lsn4classes2.Student;
import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    //private ArrayList<Student> enrolledStudents;

//    public Course(String topic, Object instructor) {
//        this.topic = topic;
//        this.instructor = instructor;
//    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
//    public String toString() {
//        return this.topic + " will be taught by " + this.instructor.getFirstName() + ".";
//    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toCompare) {
        Course otherCourse = (Course) toCompare;
        return this.topic == otherCourse.topic;
    }

}
