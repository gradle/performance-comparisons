package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_469 {
    private final Production32_469 production = new Production32_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}