package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_15 {
    private final Production32_15 production = new Production32_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}