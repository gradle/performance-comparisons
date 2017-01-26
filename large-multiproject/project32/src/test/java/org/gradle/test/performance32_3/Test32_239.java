package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_239 {
    private final Production32_239 production = new Production32_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}