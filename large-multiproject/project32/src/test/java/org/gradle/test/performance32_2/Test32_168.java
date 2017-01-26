package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_168 {
    private final Production32_168 production = new Production32_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}