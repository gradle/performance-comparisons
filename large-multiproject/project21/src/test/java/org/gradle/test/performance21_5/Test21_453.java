package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_453 {
    private final Production21_453 production = new Production21_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}