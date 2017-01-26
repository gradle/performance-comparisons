package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_144 {
    private final Production94_144 production = new Production94_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}