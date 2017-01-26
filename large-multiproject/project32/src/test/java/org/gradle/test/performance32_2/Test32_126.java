package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_126 {
    private final Production32_126 production = new Production32_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}