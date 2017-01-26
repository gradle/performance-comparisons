package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_310 {
    private final Production32_310 production = new Production32_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}