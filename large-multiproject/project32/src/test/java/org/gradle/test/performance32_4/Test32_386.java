package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_386 {
    private final Production32_386 production = new Production32_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}