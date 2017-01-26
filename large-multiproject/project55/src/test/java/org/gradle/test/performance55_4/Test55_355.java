package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_355 {
    private final Production55_355 production = new Production55_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}