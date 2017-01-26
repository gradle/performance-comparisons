package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_144 {
    private final Production55_144 production = new Production55_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}