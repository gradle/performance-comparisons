package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_144 {
    private final Production47_144 production = new Production47_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}