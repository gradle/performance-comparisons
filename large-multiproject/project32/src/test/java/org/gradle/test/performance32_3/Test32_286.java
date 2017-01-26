package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_286 {
    private final Production32_286 production = new Production32_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}