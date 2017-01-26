package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_184 {
    private final Production32_184 production = new Production32_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}