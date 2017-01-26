package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_129 {
    private final Production32_129 production = new Production32_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}