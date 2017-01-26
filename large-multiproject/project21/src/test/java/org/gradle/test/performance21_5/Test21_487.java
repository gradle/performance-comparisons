package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_487 {
    private final Production21_487 production = new Production21_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}