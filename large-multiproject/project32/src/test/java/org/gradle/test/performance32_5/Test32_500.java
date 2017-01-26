package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_500 {
    private final Production32_500 production = new Production32_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}