package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_194 {
    private final Production32_194 production = new Production32_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}