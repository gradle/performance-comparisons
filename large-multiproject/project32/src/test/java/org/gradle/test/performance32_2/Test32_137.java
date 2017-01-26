package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_137 {
    private final Production32_137 production = new Production32_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}