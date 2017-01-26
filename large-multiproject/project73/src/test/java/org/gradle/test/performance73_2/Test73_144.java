package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_144 {
    private final Production73_144 production = new Production73_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}