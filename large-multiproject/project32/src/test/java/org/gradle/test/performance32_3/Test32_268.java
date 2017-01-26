package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_268 {
    private final Production32_268 production = new Production32_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}