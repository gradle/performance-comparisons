package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_322 {
    private final Production32_322 production = new Production32_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}