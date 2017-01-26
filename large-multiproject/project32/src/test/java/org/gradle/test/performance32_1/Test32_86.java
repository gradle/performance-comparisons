package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_86 {
    private final Production32_86 production = new Production32_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}