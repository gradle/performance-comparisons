package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_374 {
    private final Production32_374 production = new Production32_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}