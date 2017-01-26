package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_101 {
    private final Production32_101 production = new Production32_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}