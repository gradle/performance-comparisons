package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_471 {
    private final Production32_471 production = new Production32_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}