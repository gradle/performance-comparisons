package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_281 {
    private final Production32_281 production = new Production32_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}