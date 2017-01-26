package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_256 {
    private final Production32_256 production = new Production32_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}