package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_13 {
    private final Production21_13 production = new Production21_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}