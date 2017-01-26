package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_144 {
    private final Production5_144 production = new Production5_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}