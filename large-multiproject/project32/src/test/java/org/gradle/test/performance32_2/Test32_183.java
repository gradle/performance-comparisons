package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_183 {
    private final Production32_183 production = new Production32_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}