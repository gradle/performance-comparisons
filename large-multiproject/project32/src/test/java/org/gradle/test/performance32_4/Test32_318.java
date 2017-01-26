package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_318 {
    private final Production32_318 production = new Production32_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}