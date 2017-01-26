package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_260 {
    private final Production32_260 production = new Production32_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}