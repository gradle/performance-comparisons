package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_361 {
    private final Production32_361 production = new Production32_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}