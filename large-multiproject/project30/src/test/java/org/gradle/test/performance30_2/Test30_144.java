package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_144 {
    private final Production30_144 production = new Production30_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}