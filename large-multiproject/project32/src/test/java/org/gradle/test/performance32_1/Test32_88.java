package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_88 {
    private final Production32_88 production = new Production32_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}