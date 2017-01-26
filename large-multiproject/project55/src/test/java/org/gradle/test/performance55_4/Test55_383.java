package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_383 {
    private final Production55_383 production = new Production55_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}