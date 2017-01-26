package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_493 {
    private final Production55_493 production = new Production55_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}