package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_242 {
    private final Production32_242 production = new Production32_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}