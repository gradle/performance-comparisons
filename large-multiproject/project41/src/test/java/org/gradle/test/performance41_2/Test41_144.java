package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_144 {
    private final Production41_144 production = new Production41_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}