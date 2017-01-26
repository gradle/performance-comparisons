package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_144 {
    private final Production43_144 production = new Production43_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}