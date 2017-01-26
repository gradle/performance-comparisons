package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_117 {
    private final Production32_117 production = new Production32_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}