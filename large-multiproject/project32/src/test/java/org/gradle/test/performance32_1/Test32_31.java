package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_31 {
    private final Production32_31 production = new Production32_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}