package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_222 {
    private final Production32_222 production = new Production32_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}