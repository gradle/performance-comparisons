package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_490 {
    private final Production32_490 production = new Production32_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}