package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_372 {
    private final Production32_372 production = new Production32_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}