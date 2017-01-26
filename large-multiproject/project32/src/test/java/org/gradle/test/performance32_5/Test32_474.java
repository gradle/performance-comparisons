package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_474 {
    private final Production32_474 production = new Production32_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}