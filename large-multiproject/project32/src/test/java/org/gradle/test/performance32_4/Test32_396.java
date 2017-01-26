package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_396 {
    private final Production32_396 production = new Production32_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}