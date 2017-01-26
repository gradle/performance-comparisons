package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_84 {
    private final Production32_84 production = new Production32_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}