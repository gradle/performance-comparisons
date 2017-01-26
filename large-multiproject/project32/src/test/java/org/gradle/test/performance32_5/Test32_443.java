package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_443 {
    private final Production32_443 production = new Production32_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}