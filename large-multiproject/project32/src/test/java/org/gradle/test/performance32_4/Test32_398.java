package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_398 {
    private final Production32_398 production = new Production32_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}