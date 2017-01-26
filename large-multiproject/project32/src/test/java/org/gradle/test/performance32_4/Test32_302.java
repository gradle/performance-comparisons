package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_302 {
    private final Production32_302 production = new Production32_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}