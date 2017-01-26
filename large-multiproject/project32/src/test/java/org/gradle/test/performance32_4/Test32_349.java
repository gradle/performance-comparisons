package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_349 {
    private final Production32_349 production = new Production32_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}