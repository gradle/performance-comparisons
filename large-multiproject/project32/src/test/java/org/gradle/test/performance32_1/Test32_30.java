package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_30 {
    private final Production32_30 production = new Production32_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}