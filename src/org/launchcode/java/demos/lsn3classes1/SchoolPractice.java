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
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public String getSubject() {
            return this.subject;
        }
        public int getYearsTeaching() {
            return this.yearsTeaching;
        }

        //Setters Here!

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setSubject(String subject) {
            this.subject = subject;
        }
        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
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
