package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_380 {
    private final Production32_380 production = new Production32_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}