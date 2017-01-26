package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_467 {
    private final Production32_467 production = new Production32_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}