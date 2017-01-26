package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_167 {
    private final Production32_167 production = new Production32_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}