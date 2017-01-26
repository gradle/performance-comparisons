package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_451 {
    private final Production21_451 production = new Production21_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}