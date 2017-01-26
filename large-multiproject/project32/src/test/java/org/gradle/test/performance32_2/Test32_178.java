package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_178 {
    private final Production32_178 production = new Production32_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}