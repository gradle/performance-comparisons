package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_26 {
    private final Production32_26 production = new Production32_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}