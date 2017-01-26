package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_10 {
    private final Production32_10 production = new Production32_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}