package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_362 {
    private final Production32_362 production = new Production32_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}