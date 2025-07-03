
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * Main class to test assignment
 * Creates a freshman and senior student
 * Sets their gpa using scanner input and prints the student info
 * @author Daniel Stevens
 */
public class MainClass {
 public static void main(String[] args) {

	 //create freshman and senior instances
	 Student std1= new Freshman("Morty", (short) 20, 12);
	 Student std2= new Senior("Rick", (short) 23, 110);

	 //Create a scanner to retrieve input
	 Scanner sc = new Scanner(System.in);

	 //GPA for freshman student is input
	 System.out.println("Enter GPA for Morty - Freshman: ");
	 double freshmanGPA = sc.nextDouble();
	 std1.setGpa(freshmanGPA);

	 //GPA for senior student is input
	 System.out.println("Enter GPA for Rick - Senior: ");
	 double seniorGPA = sc.nextDouble();
	 std2.setGpa(seniorGPA);

	 //close the scanner instance
	 sc.close();

	 //print out both students info
	 System.out.println(std1);
	 System.out.println(std2);
	}
}