package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_144 {
    private final Production83_144 production = new Production83_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}