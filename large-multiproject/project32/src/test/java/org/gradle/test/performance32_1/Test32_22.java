package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_22 {
    private final Production32_22 production = new Production32_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}