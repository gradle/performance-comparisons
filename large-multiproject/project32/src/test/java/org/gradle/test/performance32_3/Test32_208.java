package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_208 {
    private final Production32_208 production = new Production32_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}