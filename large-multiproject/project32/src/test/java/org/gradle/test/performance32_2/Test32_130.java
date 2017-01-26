package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_130 {
    private final Production32_130 production = new Production32_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}