package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_70 {
    private final Production32_70 production = new Production32_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}