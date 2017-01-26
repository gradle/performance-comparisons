package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_28 {
    private final Production32_28 production = new Production32_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}