package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_6 {
    private final Production32_6 production = new Production32_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}