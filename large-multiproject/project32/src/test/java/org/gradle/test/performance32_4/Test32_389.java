package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_389 {
    private final Production32_389 production = new Production32_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}