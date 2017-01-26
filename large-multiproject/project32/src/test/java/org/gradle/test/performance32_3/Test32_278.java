package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_278 {
    private final Production32_278 production = new Production32_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}