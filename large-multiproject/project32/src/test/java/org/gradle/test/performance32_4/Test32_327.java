package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_327 {
    private final Production32_327 production = new Production32_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}