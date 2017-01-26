package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_13 {
    private final Production32_13 production = new Production32_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}