package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_497 {
    private final Production32_497 production = new Production32_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}