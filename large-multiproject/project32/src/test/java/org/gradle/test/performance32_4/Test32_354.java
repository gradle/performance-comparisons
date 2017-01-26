package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_354 {
    private final Production32_354 production = new Production32_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}