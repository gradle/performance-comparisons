package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_93 {
    private final Production32_93 production = new Production32_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}