package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_8 {
    private final Production32_8 production = new Production32_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}