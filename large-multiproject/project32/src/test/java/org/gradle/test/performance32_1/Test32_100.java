package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_100 {
    private final Production32_100 production = new Production32_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}