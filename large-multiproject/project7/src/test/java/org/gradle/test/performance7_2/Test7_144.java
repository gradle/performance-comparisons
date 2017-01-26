package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_144 {
    private final Production7_144 production = new Production7_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}