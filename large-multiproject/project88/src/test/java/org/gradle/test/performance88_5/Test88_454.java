package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_454 {
    private final Production88_454 production = new Production88_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}