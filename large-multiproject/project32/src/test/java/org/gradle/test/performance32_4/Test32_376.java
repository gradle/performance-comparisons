package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_376 {
    private final Production32_376 production = new Production32_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}