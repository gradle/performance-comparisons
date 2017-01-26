package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_429 {
    private final Production32_429 production = new Production32_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}