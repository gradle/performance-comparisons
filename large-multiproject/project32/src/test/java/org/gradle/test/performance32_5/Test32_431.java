package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_431 {
    private final Production32_431 production = new Production32_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}