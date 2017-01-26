package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_272 {
    private final Production32_272 production = new Production32_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}