package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_346 {
    private final Production21_346 production = new Production21_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}