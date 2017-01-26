package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_144 {
    private final Production98_144 production = new Production98_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}