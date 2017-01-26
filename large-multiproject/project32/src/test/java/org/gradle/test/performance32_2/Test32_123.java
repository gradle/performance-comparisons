package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_123 {
    private final Production32_123 production = new Production32_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}