package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_44 {
    private final Production32_44 production = new Production32_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}