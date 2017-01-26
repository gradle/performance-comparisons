package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_451 {
    private final Production32_451 production = new Production32_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}