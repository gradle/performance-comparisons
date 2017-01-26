package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_321 {
    private final Production32_321 production = new Production32_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}