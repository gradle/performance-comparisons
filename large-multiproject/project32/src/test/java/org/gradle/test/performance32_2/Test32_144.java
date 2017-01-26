package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_144 {
    private final Production32_144 production = new Production32_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}