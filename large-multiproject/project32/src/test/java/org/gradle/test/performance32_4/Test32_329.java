package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_329 {
    private final Production32_329 production = new Production32_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}