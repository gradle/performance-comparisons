package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_210 {
    private final Production32_210 production = new Production32_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}