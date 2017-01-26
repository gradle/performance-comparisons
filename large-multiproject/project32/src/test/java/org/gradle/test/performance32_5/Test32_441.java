package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_441 {
    private final Production32_441 production = new Production32_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}