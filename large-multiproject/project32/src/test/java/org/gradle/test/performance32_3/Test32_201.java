package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_201 {
    private final Production32_201 production = new Production32_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}