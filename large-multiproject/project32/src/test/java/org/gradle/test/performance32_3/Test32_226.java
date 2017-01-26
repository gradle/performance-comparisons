package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_226 {
    private final Production32_226 production = new Production32_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}