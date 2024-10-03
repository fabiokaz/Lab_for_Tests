package com.kaz.testing.lab;

import com.kaz.testing.lab.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {


    @Test
    void mustCalculateCorrectlyAge() {
        Person person = new Person("Fabio", LocalDate.of(1976, 2, 26));
        Assertions.assertEquals(48, person.getAge());
    }

    @Test
    void mustBeOfLegalAge(){
        Person person = new Person("Fabio", LocalDate.of(1976, 2, 26));
        Assertions.assertTrue(person.isOfLegalAge());
    }
}
