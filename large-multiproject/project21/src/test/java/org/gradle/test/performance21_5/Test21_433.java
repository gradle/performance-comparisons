package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_433 {
    private final Production21_433 production = new Production21_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}