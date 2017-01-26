package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_96 {
    private final Production32_96 production = new Production32_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}