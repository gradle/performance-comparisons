package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_160 {
    private final Production32_160 production = new Production32_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}