package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_77 {
    private final Production32_77 production = new Production32_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}