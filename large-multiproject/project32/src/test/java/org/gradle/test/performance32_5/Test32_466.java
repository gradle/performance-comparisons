package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_466 {
    private final Production32_466 production = new Production32_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}