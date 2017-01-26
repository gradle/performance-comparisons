package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_53 {
    private final Production32_53 production = new Production32_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}