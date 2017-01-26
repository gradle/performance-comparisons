package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_74 {
    private final Production32_74 production = new Production32_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}