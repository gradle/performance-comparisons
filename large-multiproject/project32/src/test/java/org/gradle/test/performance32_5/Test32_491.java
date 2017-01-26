package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_491 {
    private final Production32_491 production = new Production32_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}