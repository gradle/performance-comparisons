package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_3 {
    private final Production32_3 production = new Production32_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}