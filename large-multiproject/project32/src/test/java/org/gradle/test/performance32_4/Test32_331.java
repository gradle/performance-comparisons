package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_331 {
    private final Production32_331 production = new Production32_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}