package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_140 {
    private final Production32_140 production = new Production32_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}