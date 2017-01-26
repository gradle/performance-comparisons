package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_144 {
    private final Production97_144 production = new Production97_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}