package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_296 {
    private final Production32_296 production = new Production32_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}