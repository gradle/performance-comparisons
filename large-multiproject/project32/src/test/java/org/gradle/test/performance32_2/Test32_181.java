package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_181 {
    private final Production32_181 production = new Production32_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}