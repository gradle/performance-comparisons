package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_80 {
    private final Production32_80 production = new Production32_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}