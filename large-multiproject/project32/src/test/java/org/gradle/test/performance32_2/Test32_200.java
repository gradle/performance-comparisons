package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_200 {
    private final Production32_200 production = new Production32_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}