package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_252 {
    private final Production32_252 production = new Production32_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}