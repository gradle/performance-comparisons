package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_262 {
    private final Production21_262 production = new Production21_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}