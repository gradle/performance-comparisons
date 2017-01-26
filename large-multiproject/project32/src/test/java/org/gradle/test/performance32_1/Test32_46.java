package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_46 {
    private final Production32_46 production = new Production32_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}