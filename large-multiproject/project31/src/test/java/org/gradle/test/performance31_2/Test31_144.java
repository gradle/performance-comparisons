package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_144 {
    private final Production31_144 production = new Production31_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}