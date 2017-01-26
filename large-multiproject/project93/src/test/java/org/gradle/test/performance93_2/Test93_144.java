package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_144 {
    private final Production93_144 production = new Production93_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}