package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_366 {
    private final Production55_366 production = new Production55_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}