package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_330 {
    private final Production32_330 production = new Production32_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}