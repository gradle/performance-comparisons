package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_21 {
    private final Production32_21 production = new Production32_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}