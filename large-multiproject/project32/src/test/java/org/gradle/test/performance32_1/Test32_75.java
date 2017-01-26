package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_75 {
    private final Production32_75 production = new Production32_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}