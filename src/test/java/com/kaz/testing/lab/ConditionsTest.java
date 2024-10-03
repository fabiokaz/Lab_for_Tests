package com.kaz.testing.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionsTest {

    @Test
    @EnabledIfSystemProperty(named = "user.name", matches = "fabio")
    void validadeIfWindowsUserIs() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfSystemProperty(named = "user.name", matches = "root")
    void invalidadeIfWindowsUserIs() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void validadeIfWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.LINUX})
    void validadeIfLinux() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void validadeOnAnyOS() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    void validadeOnJava17() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnJre({JRE.JAVA_21})
    void validadeOnJava21() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnJre({JRE.JAVA_11, JRE.JAVA_17, JRE.JAVA_21})
    void validadeOnAnyJRE() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void validadeOnAnyJRERange() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
