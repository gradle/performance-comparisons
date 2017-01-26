package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_144 {
    private final Production92_144 production = new Production92_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}