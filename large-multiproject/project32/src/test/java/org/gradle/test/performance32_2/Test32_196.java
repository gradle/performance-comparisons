package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_196 {
    private final Production32_196 production = new Production32_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}