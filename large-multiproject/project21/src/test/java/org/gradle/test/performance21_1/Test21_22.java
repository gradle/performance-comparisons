package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_22 {
    private final Production21_22 production = new Production21_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}