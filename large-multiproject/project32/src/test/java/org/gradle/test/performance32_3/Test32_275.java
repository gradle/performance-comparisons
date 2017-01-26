package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_275 {
    private final Production32_275 production = new Production32_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}