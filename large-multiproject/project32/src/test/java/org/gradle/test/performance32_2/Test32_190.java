package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_190 {
    private final Production32_190 production = new Production32_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}