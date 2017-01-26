package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_270 {
    private final Production32_270 production = new Production32_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}