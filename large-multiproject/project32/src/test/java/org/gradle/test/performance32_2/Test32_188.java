package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_188 {
    private final Production32_188 production = new Production32_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}