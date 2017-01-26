package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_405 {
    private final Production32_405 production = new Production32_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}