package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_458 {
    private final Production32_458 production = new Production32_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}