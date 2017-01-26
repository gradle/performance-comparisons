package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_417 {
    private final Production32_417 production = new Production32_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}