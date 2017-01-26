package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_476 {
    private final Production32_476 production = new Production32_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}