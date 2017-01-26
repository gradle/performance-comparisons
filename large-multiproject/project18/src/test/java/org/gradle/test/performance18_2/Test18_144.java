package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_144 {
    private final Production18_144 production = new Production18_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}