package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_144 {
    private final Production80_144 production = new Production80_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}