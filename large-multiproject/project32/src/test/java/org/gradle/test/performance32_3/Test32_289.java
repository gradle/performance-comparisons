package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_289 {
    private final Production32_289 production = new Production32_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}