package com.kaz.testing.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


public class AssumptionsTest {

    @Test
    void validadeIfWindowsUserIs() {
        Assumptions.assumeTrue("fabio".equals( System.getProperty("user.name")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    void validadeIfWindowsUserNotIs() {
        Assumptions.assumeFalse("root".equals( System.getProperty("user.name")));
        Assertions.assertNotEquals(12, 5 + 5);
    }
}
