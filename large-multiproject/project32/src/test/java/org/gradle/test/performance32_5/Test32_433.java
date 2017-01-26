package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_433 {
    private final Production32_433 production = new Production32_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}