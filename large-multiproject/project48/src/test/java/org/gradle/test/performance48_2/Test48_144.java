package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_144 {
    private final Production48_144 production = new Production48_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}