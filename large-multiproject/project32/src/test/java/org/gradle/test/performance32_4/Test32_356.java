package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_356 {
    private final Production32_356 production = new Production32_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}