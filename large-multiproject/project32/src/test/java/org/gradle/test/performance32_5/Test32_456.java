package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_456 {
    private final Production32_456 production = new Production32_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}