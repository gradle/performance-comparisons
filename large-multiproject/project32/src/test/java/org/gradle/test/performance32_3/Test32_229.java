package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_229 {
    private final Production32_229 production = new Production32_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}