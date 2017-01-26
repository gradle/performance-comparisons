package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_56 {
    private final Production32_56 production = new Production32_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}