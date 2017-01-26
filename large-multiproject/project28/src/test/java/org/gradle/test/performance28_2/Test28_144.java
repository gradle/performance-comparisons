package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_144 {
    private final Production28_144 production = new Production28_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}