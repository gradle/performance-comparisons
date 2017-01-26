package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_63 {
    private final Production32_63 production = new Production32_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}