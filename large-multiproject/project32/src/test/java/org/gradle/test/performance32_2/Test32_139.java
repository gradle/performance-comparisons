package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_139 {
    private final Production32_139 production = new Production32_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}