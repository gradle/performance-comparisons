package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_451 {
    private final Production55_451 production = new Production55_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}