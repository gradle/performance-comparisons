package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_375 {
    private final Production32_375 production = new Production32_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}