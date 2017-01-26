package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_148 {
    private final Production32_148 production = new Production32_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}