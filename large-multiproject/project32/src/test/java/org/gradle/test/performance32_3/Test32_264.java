package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_264 {
    private final Production32_264 production = new Production32_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}