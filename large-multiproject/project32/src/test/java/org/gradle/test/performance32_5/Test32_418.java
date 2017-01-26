package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_418 {
    private final Production32_418 production = new Production32_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}