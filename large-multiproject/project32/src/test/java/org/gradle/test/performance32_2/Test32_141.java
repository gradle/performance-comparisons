package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_141 {
    private final Production32_141 production = new Production32_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}