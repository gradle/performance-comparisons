package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_108 {
    private final Production32_108 production = new Production32_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}