/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Abstract class representing a human with name, address, and age
 * Superclass for student and other subclasses
 * @author Daniel Stevens
 */
public abstract class Human {
    private String name;
	private String address;
	private short age;

	/**
	 * Constructor to initialize name and age
	 * @param name name of the human
	 * @param age age of human
	 */
	public Human(String name,  short age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Getter for name
	 * @return name of human
	 */
	public String getName() {
		return name;
	}


	/**
	 * Setter for name
	 * @param name name of human
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for address
	 * @return address of human
	 */
	public String getAddress(){
		return address;
	}

	/**
	 * Setter for address
	 * @param address address of human
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Getter for age
	 * @return age of human
	 */
	public short getAge() {
		return age;
	}

	//Setter for age

	/**
	 * Setter for age
	 * @param age age of human
	 */
	public void setAge(short age) {
		this.age = age;
	}
}