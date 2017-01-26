package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_158 {
    private final Production32_158 production = new Production32_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}