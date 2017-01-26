package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_128 {
    private final Production32_128 production = new Production32_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}