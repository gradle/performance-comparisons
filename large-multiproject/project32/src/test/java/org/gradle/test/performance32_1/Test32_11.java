package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_11 {
    private final Production32_11 production = new Production32_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}