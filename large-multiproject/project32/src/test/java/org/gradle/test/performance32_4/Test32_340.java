package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_340 {
    private final Production32_340 production = new Production32_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}