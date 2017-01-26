package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_324 {
    private final Production32_324 production = new Production32_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}