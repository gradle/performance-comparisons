package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_444 {
    private final Production32_444 production = new Production32_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}