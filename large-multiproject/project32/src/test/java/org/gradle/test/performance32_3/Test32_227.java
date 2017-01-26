package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_227 {
    private final Production32_227 production = new Production32_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}