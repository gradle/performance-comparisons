package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_117 {
    private final Production21_117 production = new Production21_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}