package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_397 {
    private final Production55_397 production = new Production55_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}