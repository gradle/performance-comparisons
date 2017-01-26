package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_144 {
    private final Production44_144 production = new Production44_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}