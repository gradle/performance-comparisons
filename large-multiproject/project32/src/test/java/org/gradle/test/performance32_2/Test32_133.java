package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_133 {
    private final Production32_133 production = new Production32_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}