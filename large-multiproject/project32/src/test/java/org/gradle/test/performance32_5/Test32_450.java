package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_450 {
    private final Production32_450 production = new Production32_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}