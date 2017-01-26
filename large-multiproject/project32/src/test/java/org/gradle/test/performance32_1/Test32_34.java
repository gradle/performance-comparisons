package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_34 {
    private final Production32_34 production = new Production32_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}