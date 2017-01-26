package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_408 {
    private final Production32_408 production = new Production32_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}