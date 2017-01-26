package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_231 {
    private final Production32_231 production = new Production32_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}