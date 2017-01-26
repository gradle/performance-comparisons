package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_144 {
    private final Production22_144 production = new Production22_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}