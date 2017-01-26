package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_232 {
    private final Production32_232 production = new Production32_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}