package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_144 {
    private final Production75_144 production = new Production75_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}