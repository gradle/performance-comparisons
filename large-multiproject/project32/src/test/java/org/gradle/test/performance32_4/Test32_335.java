package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_335 {
    private final Production32_335 production = new Production32_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}