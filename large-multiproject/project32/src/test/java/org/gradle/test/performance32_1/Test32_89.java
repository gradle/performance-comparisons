package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_89 {
    private final Production32_89 production = new Production32_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}