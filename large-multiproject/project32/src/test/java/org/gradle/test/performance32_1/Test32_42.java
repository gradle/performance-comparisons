package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_42 {
    private final Production32_42 production = new Production32_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}