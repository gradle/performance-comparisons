package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_65 {
    private final Production32_65 production = new Production32_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}