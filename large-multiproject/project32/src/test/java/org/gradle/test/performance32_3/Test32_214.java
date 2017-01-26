package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_214 {
    private final Production32_214 production = new Production32_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}