package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_328 {
    private final Production32_328 production = new Production32_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}