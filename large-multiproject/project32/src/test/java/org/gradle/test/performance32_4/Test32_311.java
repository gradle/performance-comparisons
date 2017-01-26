package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_311 {
    private final Production32_311 production = new Production32_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}