package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_392 {
    private final Production32_392 production = new Production32_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}