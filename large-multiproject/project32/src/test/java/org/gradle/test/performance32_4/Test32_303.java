package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_303 {
    private final Production32_303 production = new Production32_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}