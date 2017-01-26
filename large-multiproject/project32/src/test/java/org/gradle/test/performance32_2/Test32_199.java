package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_199 {
    private final Production32_199 production = new Production32_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}