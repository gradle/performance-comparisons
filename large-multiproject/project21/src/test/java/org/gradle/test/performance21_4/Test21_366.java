package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_366 {
    private final Production21_366 production = new Production21_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}