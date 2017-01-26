package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_237 {
    private final Production32_237 production = new Production32_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}