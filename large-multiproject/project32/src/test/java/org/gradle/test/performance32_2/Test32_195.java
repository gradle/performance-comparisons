package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_195 {
    private final Production32_195 production = new Production32_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}