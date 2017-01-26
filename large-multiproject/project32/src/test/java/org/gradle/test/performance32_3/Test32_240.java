package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_240 {
    private final Production32_240 production = new Production32_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}