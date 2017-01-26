package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_95 {
    private final Production32_95 production = new Production32_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}