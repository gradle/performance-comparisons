package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_101 {
    private final Production21_101 production = new Production21_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}