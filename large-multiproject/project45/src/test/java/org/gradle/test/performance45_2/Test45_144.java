package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_144 {
    private final Production45_144 production = new Production45_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}