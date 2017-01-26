package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_132 {
    private final Production32_132 production = new Production32_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}