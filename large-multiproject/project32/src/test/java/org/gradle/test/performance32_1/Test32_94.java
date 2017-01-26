package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_94 {
    private final Production32_94 production = new Production32_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}