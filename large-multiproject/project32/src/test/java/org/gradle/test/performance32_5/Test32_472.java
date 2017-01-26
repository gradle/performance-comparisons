package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_472 {
    private final Production32_472 production = new Production32_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}