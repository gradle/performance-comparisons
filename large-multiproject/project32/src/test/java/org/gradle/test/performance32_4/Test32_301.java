package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_301 {
    private final Production32_301 production = new Production32_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}