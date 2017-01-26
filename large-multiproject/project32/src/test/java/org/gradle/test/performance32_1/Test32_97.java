package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_97 {
    private final Production32_97 production = new Production32_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}