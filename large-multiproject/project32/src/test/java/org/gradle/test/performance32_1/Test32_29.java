package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_29 {
    private final Production32_29 production = new Production32_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}