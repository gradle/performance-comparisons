package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_79 {
    private final Production32_79 production = new Production32_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}