package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_149 {
    private final Production32_149 production = new Production32_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}