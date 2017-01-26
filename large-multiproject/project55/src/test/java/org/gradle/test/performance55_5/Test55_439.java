package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_439 {
    private final Production55_439 production = new Production55_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}