package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_106 {
    private final Production32_106 production = new Production32_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}