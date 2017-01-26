package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_490 {
    private final Production21_490 production = new Production21_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}