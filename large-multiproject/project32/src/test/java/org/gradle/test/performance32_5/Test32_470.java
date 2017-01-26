package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_470 {
    private final Production32_470 production = new Production32_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}