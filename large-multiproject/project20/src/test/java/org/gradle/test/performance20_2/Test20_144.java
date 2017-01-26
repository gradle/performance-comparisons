package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_144 {
    private final Production20_144 production = new Production20_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}