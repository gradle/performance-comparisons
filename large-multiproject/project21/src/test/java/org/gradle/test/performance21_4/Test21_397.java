package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_397 {
    private final Production21_397 production = new Production21_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}