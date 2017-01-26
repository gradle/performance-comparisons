package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_407 {
    private final Production32_407 production = new Production32_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}