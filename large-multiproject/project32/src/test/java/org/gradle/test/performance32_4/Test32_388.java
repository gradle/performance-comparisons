package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_388 {
    private final Production32_388 production = new Production32_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}