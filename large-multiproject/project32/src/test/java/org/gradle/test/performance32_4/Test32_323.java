package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_323 {
    private final Production32_323 production = new Production32_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}