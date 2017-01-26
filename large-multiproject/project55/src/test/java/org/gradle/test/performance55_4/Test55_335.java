package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_335 {
    private final Production55_335 production = new Production55_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}