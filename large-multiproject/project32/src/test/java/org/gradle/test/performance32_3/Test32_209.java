package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_209 {
    private final Production32_209 production = new Production32_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}