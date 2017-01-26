package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_415 {
    private final Production32_415 production = new Production32_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}