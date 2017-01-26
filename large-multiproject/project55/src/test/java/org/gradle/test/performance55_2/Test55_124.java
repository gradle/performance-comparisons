package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_124 {
    private final Production55_124 production = new Production55_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}