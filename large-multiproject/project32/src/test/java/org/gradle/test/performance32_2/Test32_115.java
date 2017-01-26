package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_115 {
    private final Production32_115 production = new Production32_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}