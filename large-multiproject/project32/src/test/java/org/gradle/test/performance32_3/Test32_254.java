package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_254 {
    private final Production32_254 production = new Production32_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}