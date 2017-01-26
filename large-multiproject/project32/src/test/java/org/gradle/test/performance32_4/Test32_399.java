package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_399 {
    private final Production32_399 production = new Production32_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}