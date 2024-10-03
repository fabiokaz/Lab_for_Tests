package com.kaz.testing.lab;

import com.kaz.testing.lab.model.Person;
import com.kaz.testing.lab.service.DataBase;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

public class DataFromPersonTest {

    private static final Logger LOGGER = Logger.getLogger(DataFromPersonTest.class.getName());

    @BeforeAll
    static void settingConection(){
        DataBase.startConection();
    }

    @AfterAll
    static void closeConnection(){
        DataBase.stopConection();
    }

    @BeforeEach
    void insertAllData(){
        DataBase.putData();
    }

    @AfterEach
    void removeAllDatas(){
        DataBase.deleteData();
    }

    @Test
    void validateDataFromPerson(){
        LOGGER.info("validateDataFromPerson()");
        Person person = new Person("Kaz", LocalDate.of(2010, 1, 1));
        assertEquals("Kaz", person.getName());
    }

    @Test
    void validateDataFromPerson2(){
        LOGGER.info("validateDataFromPerson2()");
        Person person = new Person("Kaz", LocalDate.of(2010, 1, 1));
        assertEquals(LocalDate.of(2010, 1, 1), person.getBirthDate());
    }
}
