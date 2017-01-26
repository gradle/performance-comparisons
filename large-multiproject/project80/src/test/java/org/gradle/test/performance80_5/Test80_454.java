package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_454 {
    private final Production80_454 production = new Production80_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}