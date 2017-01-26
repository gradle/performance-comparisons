package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_144 {
    private final Production40_144 production = new Production40_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}