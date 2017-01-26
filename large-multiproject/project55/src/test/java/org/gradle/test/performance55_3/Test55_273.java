package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_273 {
    private final Production55_273 production = new Production55_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}