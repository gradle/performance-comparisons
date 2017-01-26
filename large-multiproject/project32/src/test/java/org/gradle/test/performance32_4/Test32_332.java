package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_332 {
    private final Production32_332 production = new Production32_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}