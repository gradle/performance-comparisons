package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_440 {
    private final Production32_440 production = new Production32_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}