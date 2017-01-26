package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_262 {
    private final Production32_262 production = new Production32_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}