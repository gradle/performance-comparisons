package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_152 {
    private final Production32_152 production = new Production32_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}