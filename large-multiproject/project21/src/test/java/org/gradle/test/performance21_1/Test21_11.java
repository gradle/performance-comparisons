package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_11 {
    private final Production21_11 production = new Production21_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}