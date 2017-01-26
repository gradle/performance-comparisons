package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_348 {
    private final Production32_348 production = new Production32_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}