package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_112 {
    private final Production32_112 production = new Production32_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}