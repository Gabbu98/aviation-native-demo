package com.demo.aviation.configurations.properties;

import java.util.Objects;

public class Student {

    private String studentID;
    private String name;
    private int age;
    private int totalFlightHours;
    private String currentAircraft;

    private Student() {
    }

    public Student(String studentID, String name, int age, int totalFlightHours, String currentAircraft) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.totalFlightHours = totalFlightHours;
        this.currentAircraft = currentAircraft;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalFlightHours() {
        return totalFlightHours;
    }

    public void setTotalFlightHours(int totalFlightHours) {
        this.totalFlightHours = totalFlightHours;
    }

    public String getCurrentAircraft() {
        return currentAircraft;
    }

    public void setCurrentAircraft(String currentAircraft) {
        this.currentAircraft = currentAircraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && totalFlightHours == student.totalFlightHours && Objects.equals(studentID,
                student.studentID) && Objects.equals(name, student.name) && Objects.equals(currentAircraft, student.currentAircraft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, name, age, totalFlightHours, currentAircraft);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", totalFlightHours=" + totalFlightHours +
                ", currentAircraft='" + currentAircraft + '\'' +
                '}';
    }
}
