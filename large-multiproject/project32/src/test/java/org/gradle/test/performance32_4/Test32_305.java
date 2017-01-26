package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_305 {
    private final Production32_305 production = new Production32_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}