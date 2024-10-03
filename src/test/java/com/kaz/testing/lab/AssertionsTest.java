package com.kaz.testing.lab;

import static org.junit.jupiter.api.Assertions.*;

import com.kaz.testing.lab.model.Person;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void validateDifferentArrays(){
        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {-1, -5, 10, 2, 3};
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validateEqualArrays(){
        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {10, 20, 30, 40, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validateNullObject(){
        Person person = null;
        assertNull(person);

        person = new Person("Kaz", LocalDate.now());
        assertNotNull(person);
    }

    @Test
    void validateDifferentTypesOfNumbers(){
        double valorUm = 2.0;
        double valorDois = 2.0;
        assertEquals(valorUm, valorDois);
    }
}
