package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_283 {
    private final Production32_283 production = new Production32_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}