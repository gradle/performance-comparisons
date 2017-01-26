package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_337 {
    private final Production32_337 production = new Production32_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}