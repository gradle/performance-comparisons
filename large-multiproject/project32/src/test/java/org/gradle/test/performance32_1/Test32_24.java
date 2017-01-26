package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_24 {
    private final Production32_24 production = new Production32_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}