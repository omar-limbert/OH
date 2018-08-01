/*
 * @(#)PersonTest.java
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

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PersonTest {

    private Person personWithAge;

    /**
     * Init the object Person.
     */
    @Before
    public void init() {
        personWithAge = new Person("Juan", "Perez", "Male", 25);
    }

    /**
     * this method is to verify if can construct a person with out age.
     */
    @Test
    public void canConstructAPersonWithOutAge() {
        Person person = new Person("Juan", "Perez", "Male");
        assertEquals("Juan", person.getFirstName());
    }

    /**
     * this method is to verify if can construct a person with age.
     */
    @Test
    public void canConstructAPersonWithOAge() {
        Person person = new Person("Juan", "Perez", "Male",26);
        assertEquals(26, person.getAge());
    }

    /**
     * this method is to verify if can I get first name of person.
     */
    @Test
    public void canGetFirstNameOfPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 25);
        assertEquals("Juan", personWithAge.getFirstName());
    }

    /**
     * this method is to verify if can I set first name of person.
     */
    @Test
    public void canSetFirstNameOfPerson() {
        personWithAge.setFirstName("New First Name");
        assertEquals("New First Name", personWithAge.getFirstName());
    }

    /**
     * this method is to verify if can I get last name of person.
     */
    @Test
    public void canGetLastNameOfPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 25);
        assertEquals("Perez", personWithAge.getLastName());
    }

    /**
     * this method is to verify if can I set last name of person.
     */
    @Test
    public void canSetLastNameOfPerson() {
        personWithAge.setLastName("New Last Name");
        assertEquals("New Last Name", personWithAge.getLastName());
    }

    /**
     * this method is to verify if can I get last name of person.
     */
    @Test
    public void canGetGenderOfPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 25);
        assertEquals("Male", personWithAge.getGender());
    }

    /**
     * this method is to verify if can I get gender of person.
     */
    @Test
    public void canSetGenderOfPerson() {
        personWithAge.setGender("Female");
        assertEquals("Female", personWithAge.getGender());
    }

    /**
     * this method is to verify if can I get last name of person.
     */
    @Test
    public void canGetAgeOfPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 25);
        assertEquals(25, personWithAge.getAge());
    }

    /**
     * this method is to verify if can I get gender of person.
     */
    @Test
    public void canSetAgeOfPerson() {
        personWithAge.setAge(10);
        assertEquals(10, personWithAge.getAge());
    }

    /**
     * this method is to verify if is a older person.
     */
    @Test
    public void canVerifyIfIsAOlderPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 80);
        assertTrue(personWithAge.isOlderPerson());
    }

    /**
     * this method is to verify if is not a older person.
     */
    @Test
    public void canVerifyIfIsNotAOlderPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 10);
        assertFalse(personWithAge.isOlderPerson());
    }

    /**
     * this method is to verify if is a young person.
     */
    @Test
    public void canVerifyIfIsAYoungPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 12);
        assertTrue(personWithAge.isYoungPerson());
    }

    /**
     * this method is to verify if is not a young person.
     */
    @Test
    public void canVerifyIfIsNotAYoungPerson() {
        personWithAge = new Person("Juan", "Perez", "Male", 30);
        assertFalse(personWithAge.isYoungPerson());
    }


    /**
     * this method is to verify if a Person Information show correctly.
     */
    @Test
    public void canVerifyIfPersonInformationAsShownCorrectly() {
        personWithAge = new Person("Juan", "Perez", "Male", 10);
        String personInformation = "First Name: Juan\n" +
                "Last Name: Perez\n" +
                "Gender: Male\n" +
                "Age: 10\n" +
                "Old?: false\n";

        assertEquals(personInformation, personWithAge.toString());
    }


}
