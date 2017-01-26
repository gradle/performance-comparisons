package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_83 {
    private final Production32_83 production = new Production32_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}