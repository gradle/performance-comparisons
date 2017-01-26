package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_409 {
    private final Production32_409 production = new Production32_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}