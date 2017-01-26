package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_143 {
    private final Production32_143 production = new Production32_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}