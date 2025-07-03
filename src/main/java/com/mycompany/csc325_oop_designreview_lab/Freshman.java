package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class that represents a new student
 * Extends student and adds credits member variable
 * @author Daniel Stevens
 */
public class Freshman extends Student {
    private int credits;

    /**
     * Constructor for a freshman student with name, age, and credits
     * @param name name of the freshman
     * @param age age of the freshman
     * @param credits credits the freshman is taking
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    //Getter for freshman credits

    /**
     * Gets number of freshman student credits
     * @return credits taken by a freshman
     */
    public int getCredits() {
        return credits;
    }

    //Setter for freshman credits

    /**
     * Sets the number of freshman student credits
     * @param credits credits taken by a freshman
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /** Returns freshman student as a String
     * @return string with name, age, gpa, and credits
     */
    @Override
    public String toString() {
        return "Freshman: " + super.toString() + ", Credits: " + credits;
    }
}
