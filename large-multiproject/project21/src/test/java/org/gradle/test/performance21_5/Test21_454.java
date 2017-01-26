package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_454 {
    private final Production21_454 production = new Production21_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}