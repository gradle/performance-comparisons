package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_261 {
    private final Production32_261 production = new Production32_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}