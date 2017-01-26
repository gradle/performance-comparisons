package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_248 {
    private final Production32_248 production = new Production32_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}