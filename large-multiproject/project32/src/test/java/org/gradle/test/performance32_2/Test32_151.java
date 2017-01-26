package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_151 {
    private final Production32_151 production = new Production32_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}