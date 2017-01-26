package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_490 {
    private final Production55_490 production = new Production55_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}