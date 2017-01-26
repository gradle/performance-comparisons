package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_33 {
    private final Production32_33 production = new Production32_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}