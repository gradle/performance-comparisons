package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_333 {
    private final Production32_333 production = new Production32_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}