package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_454 {
    private final Production98_454 production = new Production98_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}