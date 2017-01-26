package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_427 {
    private final Production32_427 production = new Production32_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}