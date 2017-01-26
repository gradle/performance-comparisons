package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_300 {
    private final Production32_300 production = new Production32_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}