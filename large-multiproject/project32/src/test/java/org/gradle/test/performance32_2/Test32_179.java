package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_179 {
    private final Production32_179 production = new Production32_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}