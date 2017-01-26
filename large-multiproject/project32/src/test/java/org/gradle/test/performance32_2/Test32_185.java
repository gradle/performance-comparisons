package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_185 {
    private final Production32_185 production = new Production32_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}