/*
 * @(#)Person.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * Address
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */
package org.gradle;

/**
 * This class represent a Person.
 *
 * @author Omar Limbert Huanca sanchez - AT-[06]
 * @version 1.0.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    private static final int OLD_AGE = 70;
    private static final int YOUNG_AGE = 25;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    /**
     * Set the first name for the Person.
     *
     * @param firstName this is first name of Person.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the first name for the person.
     *
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Set the last name for the person.
     *
     * @param lastName this is last name of Person.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the last name for the person.
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Set the gender for the person.
     *
     * @param gender this is gender name of Person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get the person's gender.
     *
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Set the person's age.
     *
     * @param age this is age name of Person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the person's age.
     *
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Checks to see if the person is old.
     * If they are 70 or older, they are
     * considered to be old.
     *
     * @return boolean
     */
    public boolean isOlderPerson() {
        return this.age >= OLD_AGE;
    }

    /**
     * Checks to see if the person is young.
     *
     * @return boolean
     */
    public boolean isYoungPerson() {
        return this.age <= YOUNG_AGE;
    }

    /**
     * This is the string representation of a Person object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String output = "";

        output += "First Name: " + getFirstName() + "\n";
        output += "Last Name: " + getLastName() + "\n";
        output += "Gender: " + getGender() + "\n";
        output += "Age: " + getAge() + "\n";
        output += "Old?: " + isOlderPerson() + "\n";

        return output;
    }
}
