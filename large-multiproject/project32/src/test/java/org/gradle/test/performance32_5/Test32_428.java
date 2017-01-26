package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_428 {
    private final Production32_428 production = new Production32_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}