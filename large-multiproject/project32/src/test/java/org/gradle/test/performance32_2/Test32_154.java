package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_154 {
    private final Production32_154 production = new Production32_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}