package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_366 {
    private final Production75_366 production = new Production75_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}