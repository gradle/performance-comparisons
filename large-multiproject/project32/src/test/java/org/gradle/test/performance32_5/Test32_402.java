package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_402 {
    private final Production32_402 production = new Production32_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}