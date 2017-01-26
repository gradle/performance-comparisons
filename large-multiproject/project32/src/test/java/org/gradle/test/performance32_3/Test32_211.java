package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_211 {
    private final Production32_211 production = new Production32_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}