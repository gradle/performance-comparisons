package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_144 {
    private final Production16_144 production = new Production16_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}