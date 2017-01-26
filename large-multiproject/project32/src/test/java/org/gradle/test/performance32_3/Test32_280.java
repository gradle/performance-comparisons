package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_280 {
    private final Production32_280 production = new Production32_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}