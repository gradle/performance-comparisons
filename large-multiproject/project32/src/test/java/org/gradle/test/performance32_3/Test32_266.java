package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_266 {
    private final Production32_266 production = new Production32_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}