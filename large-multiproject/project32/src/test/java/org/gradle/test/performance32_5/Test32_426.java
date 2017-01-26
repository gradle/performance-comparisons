package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_426 {
    private final Production32_426 production = new Production32_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}