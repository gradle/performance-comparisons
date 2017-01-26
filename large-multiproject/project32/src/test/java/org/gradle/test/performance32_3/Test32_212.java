package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_212 {
    private final Production32_212 production = new Production32_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}