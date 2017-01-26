package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_67 {
    private final Production32_67 production = new Production32_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}