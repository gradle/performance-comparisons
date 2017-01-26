package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_221 {
    private final Production32_221 production = new Production32_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}