package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_250 {
    private final Production32_250 production = new Production32_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}