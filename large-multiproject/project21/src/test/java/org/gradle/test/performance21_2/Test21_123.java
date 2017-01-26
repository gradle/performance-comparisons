package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_123 {
    private final Production21_123 production = new Production21_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}