package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_215 {
    private final Production32_215 production = new Production32_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}