package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_72 {
    private final Production32_72 production = new Production32_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}