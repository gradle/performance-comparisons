package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_430 {
    private final Production32_430 production = new Production32_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}