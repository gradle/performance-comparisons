package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_359 {
    private final Production32_359 production = new Production32_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}