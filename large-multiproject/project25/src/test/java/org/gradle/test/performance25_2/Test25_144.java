package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_144 {
    private final Production25_144 production = new Production25_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}