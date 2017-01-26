package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_198 {
    private final Production32_198 production = new Production32_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}