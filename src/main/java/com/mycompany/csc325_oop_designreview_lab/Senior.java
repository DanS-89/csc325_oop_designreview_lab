package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class that represents a new student
 * Extends student and adds credits member variable with additional logic
 * @author Daniel Stevens
 */
public class Senior extends Student {
    private int credits;

    /**
     * Constructor for a senior with name, age, and credits
     * @param name Senior's student's name
     * @param age Senior's student's age
     * @param credits Senior's student's credits, must be greater than 85
     */
    public Senior(String name, short age, int credits) {
        super(name, age);
        if(credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 Credits");
        }
        this.credits = credits;
    }

    /**
     * Gets the number of credits
     * @return number of credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the number of credits
     * @param credits number of credits, must be greater than 85
     */
    public void setCredits(int credits) {
        if(credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 Credits");
        }
        this.credits = credits;
    }

    /**
     * Returns senior student as a string
     * @return string with name, age, and credits
     */
    @Override
    public String toString() {
        return "Senior: " + super.toString() + ", Credits: " + credits;
    }
}
