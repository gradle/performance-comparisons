package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_144 {
    private final Production84_144 production = new Production84_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}