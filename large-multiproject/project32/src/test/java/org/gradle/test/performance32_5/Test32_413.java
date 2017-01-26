package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_413 {
    private final Production32_413 production = new Production32_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}