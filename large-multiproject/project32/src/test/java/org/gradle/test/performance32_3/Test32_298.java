package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_298 {
    private final Production32_298 production = new Production32_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}