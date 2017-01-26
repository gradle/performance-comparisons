package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_41 {
    private final Production32_41 production = new Production32_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}