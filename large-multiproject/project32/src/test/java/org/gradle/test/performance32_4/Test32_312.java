package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_312 {
    private final Production32_312 production = new Production32_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}