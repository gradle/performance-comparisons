package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_291 {
    private final Production32_291 production = new Production32_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}