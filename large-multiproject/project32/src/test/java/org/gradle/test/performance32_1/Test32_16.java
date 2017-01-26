package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_16 {
    private final Production32_16 production = new Production32_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}