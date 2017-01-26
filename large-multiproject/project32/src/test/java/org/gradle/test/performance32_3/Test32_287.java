package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_287 {
    private final Production32_287 production = new Production32_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}