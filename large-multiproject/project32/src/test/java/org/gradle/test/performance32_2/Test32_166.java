package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_166 {
    private final Production32_166 production = new Production32_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}