package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_478 {
    private final Production21_478 production = new Production21_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}