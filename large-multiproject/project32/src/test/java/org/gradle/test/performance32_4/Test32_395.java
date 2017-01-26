package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_395 {
    private final Production32_395 production = new Production32_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}