package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_197 {
    private final Production32_197 production = new Production32_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}