package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_225 {
    private final Production32_225 production = new Production32_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}