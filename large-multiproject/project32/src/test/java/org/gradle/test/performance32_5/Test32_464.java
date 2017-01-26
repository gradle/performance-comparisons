package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_464 {
    private final Production32_464 production = new Production32_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}