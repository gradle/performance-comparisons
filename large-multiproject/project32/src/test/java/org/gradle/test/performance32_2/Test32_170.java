package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_170 {
    private final Production32_170 production = new Production32_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}