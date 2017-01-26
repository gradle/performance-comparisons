package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_487 {
    private final Production32_487 production = new Production32_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}