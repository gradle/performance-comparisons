package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_19 {
    private final Production32_19 production = new Production32_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}