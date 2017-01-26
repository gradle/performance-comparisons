package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_345 {
    private final Production32_345 production = new Production32_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}