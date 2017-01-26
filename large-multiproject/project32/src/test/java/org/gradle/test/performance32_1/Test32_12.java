package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_12 {
    private final Production32_12 production = new Production32_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}