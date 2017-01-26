package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_245 {
    private final Production32_245 production = new Production32_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}