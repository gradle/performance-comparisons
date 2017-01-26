package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_371 {
    private final Production32_371 production = new Production32_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}