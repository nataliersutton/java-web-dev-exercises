package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student meStudent = new Student ("Natalie", 12345678, 1, 4.0 );
        System.out.println("Student Name: " + meStudent.getName() + " Student Id: " + meStudent.getStudentId() + " Credits: " + meStudent.getNumberOfCredits() + " GPA: " + meStudent.getGpa());
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        //Getters Here!

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getSubject() {
            return subject;
        }
        public int getYearsTeaching() {
            return yearsTeaching;
        }

        //Setters Here!

        public void setFirstName(String aFirstName) {
            firstName = aFirstName;
        }
        public void setLastName(String aLastName) {
            lastName = aLastName;
        }
        public void setSubject(String aSubject) {
            subject = aSubject;
        }
        public void setYearsTeaching(int aYearsTeaching) {
            yearsTeaching = aYearsTeaching;
        }

        //Create Constructor Here!
        public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }

}
