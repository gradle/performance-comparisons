package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_408 {
    private final Production55_408 production = new Production55_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}