package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_295 {
    private final Production32_295 production = new Production32_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}