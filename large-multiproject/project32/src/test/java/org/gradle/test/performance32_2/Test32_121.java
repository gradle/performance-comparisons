package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_121 {
    private final Production32_121 production = new Production32_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}