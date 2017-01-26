package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_384 {
    private final Production32_384 production = new Production32_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}