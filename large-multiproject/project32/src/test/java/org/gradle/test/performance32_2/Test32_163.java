package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_163 {
    private final Production32_163 production = new Production32_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}