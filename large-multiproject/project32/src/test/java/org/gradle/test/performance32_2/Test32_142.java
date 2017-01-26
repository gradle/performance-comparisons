package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_142 {
    private final Production32_142 production = new Production32_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}