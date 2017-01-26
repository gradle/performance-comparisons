package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_381 {
    private final Production32_381 production = new Production32_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}