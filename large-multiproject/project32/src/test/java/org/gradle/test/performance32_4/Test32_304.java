package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_304 {
    private final Production32_304 production = new Production32_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}