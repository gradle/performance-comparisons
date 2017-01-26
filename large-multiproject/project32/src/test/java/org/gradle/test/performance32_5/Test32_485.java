package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_485 {
    private final Production32_485 production = new Production32_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}