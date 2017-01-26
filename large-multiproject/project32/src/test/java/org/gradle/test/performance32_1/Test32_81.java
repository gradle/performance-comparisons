package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_81 {
    private final Production32_81 production = new Production32_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}