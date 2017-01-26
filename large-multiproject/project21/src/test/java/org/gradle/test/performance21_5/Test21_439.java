package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_439 {
    private final Production21_439 production = new Production21_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}