package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_488 {
    private final Production32_488 production = new Production32_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}