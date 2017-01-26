package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_61 {
    private final Production32_61 production = new Production32_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}