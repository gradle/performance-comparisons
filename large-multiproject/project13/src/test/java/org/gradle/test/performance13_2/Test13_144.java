package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_144 {
    private final Production13_144 production = new Production13_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}