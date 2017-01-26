package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_38 {
    private final Production32_38 production = new Production32_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}