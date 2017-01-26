package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_454 {
    private final Production48_454 production = new Production48_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}