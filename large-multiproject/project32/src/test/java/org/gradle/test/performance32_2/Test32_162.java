package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_162 {
    private final Production32_162 production = new Production32_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}