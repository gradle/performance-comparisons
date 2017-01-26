package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_161 {
    private final Production32_161 production = new Production32_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}