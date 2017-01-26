package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_216 {
    private final Production32_216 production = new Production32_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}