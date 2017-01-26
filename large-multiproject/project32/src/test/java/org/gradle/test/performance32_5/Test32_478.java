package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_478 {
    private final Production32_478 production = new Production32_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}