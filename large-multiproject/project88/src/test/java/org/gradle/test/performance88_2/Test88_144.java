package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_144 {
    private final Production88_144 production = new Production88_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}