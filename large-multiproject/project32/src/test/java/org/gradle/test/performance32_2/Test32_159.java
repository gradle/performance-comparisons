package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_159 {
    private final Production32_159 production = new Production32_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}