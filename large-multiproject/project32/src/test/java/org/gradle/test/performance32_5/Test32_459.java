package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_459 {
    private final Production32_459 production = new Production32_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}