package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_334 {
    private final Production32_334 production = new Production32_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}