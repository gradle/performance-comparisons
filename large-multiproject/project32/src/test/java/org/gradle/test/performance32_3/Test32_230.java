package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_230 {
    private final Production32_230 production = new Production32_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}