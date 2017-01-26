package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_35 {
    private final Production32_35 production = new Production32_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}