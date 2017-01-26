package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_57 {
    private final Production32_57 production = new Production32_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}