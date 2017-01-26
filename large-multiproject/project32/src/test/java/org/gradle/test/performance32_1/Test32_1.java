package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_1 {
    private final Production32_1 production = new Production32_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}