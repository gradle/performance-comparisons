package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_182 {
    private final Production32_182 production = new Production32_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}