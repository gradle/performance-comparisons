package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_317 {
    private final Production32_317 production = new Production32_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}