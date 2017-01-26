package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_249 {
    private final Production32_249 production = new Production32_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}