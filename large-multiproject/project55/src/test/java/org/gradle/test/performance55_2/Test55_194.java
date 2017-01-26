package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_194 {
    private final Production55_194 production = new Production55_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}