package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_402 {
    private final Production55_402 production = new Production55_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}