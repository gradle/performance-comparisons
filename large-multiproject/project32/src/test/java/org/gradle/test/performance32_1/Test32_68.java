package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_68 {
    private final Production32_68 production = new Production32_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}