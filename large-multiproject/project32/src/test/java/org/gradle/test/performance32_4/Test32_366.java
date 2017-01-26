package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_366 {
    private final Production32_366 production = new Production32_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}