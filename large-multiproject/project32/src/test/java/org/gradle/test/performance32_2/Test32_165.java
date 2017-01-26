package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_165 {
    private final Production32_165 production = new Production32_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}