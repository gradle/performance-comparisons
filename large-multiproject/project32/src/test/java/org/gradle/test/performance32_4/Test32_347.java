package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_347 {
    private final Production32_347 production = new Production32_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}