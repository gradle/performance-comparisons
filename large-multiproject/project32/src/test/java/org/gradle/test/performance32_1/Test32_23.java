package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_23 {
    private final Production32_23 production = new Production32_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}