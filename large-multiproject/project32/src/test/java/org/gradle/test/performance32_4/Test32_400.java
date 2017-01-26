package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_400 {
    private final Production32_400 production = new Production32_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}