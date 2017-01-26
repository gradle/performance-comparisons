package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_144 {
    private final Production50_144 production = new Production50_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}