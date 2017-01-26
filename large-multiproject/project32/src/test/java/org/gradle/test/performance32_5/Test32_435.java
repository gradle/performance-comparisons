package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_435 {
    private final Production32_435 production = new Production32_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}