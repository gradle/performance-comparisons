package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_91 {
    private final Production32_91 production = new Production32_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}