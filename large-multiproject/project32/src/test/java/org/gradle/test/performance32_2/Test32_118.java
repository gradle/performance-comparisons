package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_118 {
    private final Production32_118 production = new Production32_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}