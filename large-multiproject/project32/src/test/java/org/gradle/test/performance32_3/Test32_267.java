package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_267 {
    private final Production32_267 production = new Production32_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}