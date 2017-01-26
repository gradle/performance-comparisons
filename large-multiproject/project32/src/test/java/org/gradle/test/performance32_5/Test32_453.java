package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_453 {
    private final Production32_453 production = new Production32_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}