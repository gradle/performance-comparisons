package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_153 {
    private final Production32_153 production = new Production32_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}