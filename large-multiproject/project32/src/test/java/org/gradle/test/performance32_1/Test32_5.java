package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_5 {
    private final Production32_5 production = new Production32_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}