package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_102 {
    private final Production32_102 production = new Production32_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}