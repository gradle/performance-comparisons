package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_90 {
    private final Production32_90 production = new Production32_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}