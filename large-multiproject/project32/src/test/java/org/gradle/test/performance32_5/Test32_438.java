package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_438 {
    private final Production32_438 production = new Production32_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}