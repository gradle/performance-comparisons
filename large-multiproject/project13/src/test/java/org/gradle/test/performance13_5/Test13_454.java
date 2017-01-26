package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_454 {
    private final Production13_454 production = new Production13_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}