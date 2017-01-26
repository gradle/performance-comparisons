package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_413 {
    private final Production21_413 production = new Production21_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}