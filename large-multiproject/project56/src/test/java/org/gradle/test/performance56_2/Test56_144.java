package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_144 {
    private final Production56_144 production = new Production56_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}