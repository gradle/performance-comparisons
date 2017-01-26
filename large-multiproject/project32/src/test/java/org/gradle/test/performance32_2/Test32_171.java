package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_171 {
    private final Production32_171 production = new Production32_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}