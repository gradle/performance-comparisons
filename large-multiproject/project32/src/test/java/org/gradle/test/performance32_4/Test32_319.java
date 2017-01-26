package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_319 {
    private final Production32_319 production = new Production32_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}