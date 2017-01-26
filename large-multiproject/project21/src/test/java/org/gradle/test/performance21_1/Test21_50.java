package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_50 {
    private final Production21_50 production = new Production21_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}