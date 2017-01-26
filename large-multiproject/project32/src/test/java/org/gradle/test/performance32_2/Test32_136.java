package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_136 {
    private final Production32_136 production = new Production32_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}