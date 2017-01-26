package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_169 {
    private final Production32_169 production = new Production32_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}