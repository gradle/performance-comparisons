package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_150 {
    private final Production32_150 production = new Production32_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}