package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_117 {
    private final Production55_117 production = new Production55_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}