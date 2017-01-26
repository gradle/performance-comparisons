package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_454 {
    private final Production40_454 production = new Production40_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}