package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_60 {
    private final Production32_60 production = new Production32_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}