package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_110 {
    private final Production32_110 production = new Production32_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}