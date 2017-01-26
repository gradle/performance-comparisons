package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_39 {
    private final Production32_39 production = new Production32_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}