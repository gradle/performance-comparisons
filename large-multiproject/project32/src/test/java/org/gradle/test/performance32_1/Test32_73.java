package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_73 {
    private final Production32_73 production = new Production32_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}