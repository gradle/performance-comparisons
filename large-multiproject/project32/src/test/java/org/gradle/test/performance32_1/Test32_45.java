package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_45 {
    private final Production32_45 production = new Production32_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}