package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_223 {
    private final Production32_223 production = new Production32_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}