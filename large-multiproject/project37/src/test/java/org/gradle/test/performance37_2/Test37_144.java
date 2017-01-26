package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_144 {
    private final Production37_144 production = new Production37_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}