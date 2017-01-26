package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_125 {
    private final Production32_125 production = new Production32_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}