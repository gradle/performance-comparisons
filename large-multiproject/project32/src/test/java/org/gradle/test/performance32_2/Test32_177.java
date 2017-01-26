package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_177 {
    private final Production32_177 production = new Production32_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}