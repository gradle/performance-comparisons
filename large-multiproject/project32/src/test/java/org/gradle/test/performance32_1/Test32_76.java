package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_76 {
    private final Production32_76 production = new Production32_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}