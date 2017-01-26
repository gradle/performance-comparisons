package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_194 {
    private final Production21_194 production = new Production21_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}