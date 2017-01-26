package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_119 {
    private final Production32_119 production = new Production32_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}