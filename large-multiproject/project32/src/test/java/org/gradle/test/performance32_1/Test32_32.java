package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_32 {
    private final Production32_32 production = new Production32_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}