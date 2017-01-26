package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_174 {
    private final Production32_174 production = new Production32_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}