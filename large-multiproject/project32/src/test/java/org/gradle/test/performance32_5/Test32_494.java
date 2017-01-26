package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_494 {
    private final Production32_494 production = new Production32_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}