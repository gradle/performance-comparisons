package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_297 {
    private final Production32_297 production = new Production32_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}