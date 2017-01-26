package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_308 {
    private final Production32_308 production = new Production32_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}