package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_411 {
    private final Production32_411 production = new Production32_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}