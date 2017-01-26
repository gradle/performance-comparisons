package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_49 {
    private final Production32_49 production = new Production32_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}