package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_189 {
    private final Production32_189 production = new Production32_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}