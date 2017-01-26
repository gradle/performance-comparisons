package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_338 {
    private final Production32_338 production = new Production32_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}