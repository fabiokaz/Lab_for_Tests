package com.kaz.testing.lab;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Ordering by order annotation
//@TestMethodOrder(MethodOrderer.MethodName.class) // Ordering by method name
//@TestMethodOrder(MethodOrderer.Random.class) // // Ordering randomized
//@TestMethodOrder(MethodOrderer.DisplayName.class) // Ordering by display name
@TestClassOrder(ClassOrderer.OrderAnnotation.class) // Ordering by order annotation
//
public class ChoosingTestOrderTest {

    //@DisplayName("A")
    @Order(4)
    @Test
    void validadeAFlow(){
        //Arrange
        //Act
        //Assert
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validadeBFlow(){
        //Arrange
        //Act
        //Assert
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validadeCFlow(){
        //Arrange
        //Act
        //Assert
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validadeYetAnotherFlow(){
        //Arrange
        //Act
        //Assert
        Assertions.assertTrue(true);
    }
}
