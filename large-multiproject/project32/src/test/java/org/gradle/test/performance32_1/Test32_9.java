package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_9 {
    private final Production32_9 production = new Production32_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}