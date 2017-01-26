package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_147 {
    private final Production32_147 production = new Production32_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}