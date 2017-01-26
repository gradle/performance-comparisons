package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_144 {
    private final Production35_144 production = new Production35_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}