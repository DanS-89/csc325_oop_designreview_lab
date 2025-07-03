/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student class that extends human and adds GPA member variable
 * Superclass for freshman and senior subclasses
 * @author Daniel Stevens
 */
public class Student extends Human {

    //add member variable gpa
    private double gpa;

    /**
     * Constructor for a student with name and age
     * @param name name of the student
     * @param age age of the student
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Gets student gpa
     * @return gpa of student
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets student gpa
     * @param gpa gpa of student to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Returns student as a String
     * @return string with name, age, and gpa
     */
    @Override
    public String toString(){
        return "Student name: " + getName() + ", age: " + getAge() + ", GPA: " + getGpa();
    }
}