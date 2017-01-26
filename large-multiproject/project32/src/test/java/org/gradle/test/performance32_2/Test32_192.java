package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_192 {
    private final Production32_192 production = new Production32_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}