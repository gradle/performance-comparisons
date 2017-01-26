package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_385 {
    private final Production21_385 production = new Production21_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}