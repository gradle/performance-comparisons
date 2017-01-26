package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_389 {
    private final Production55_389 production = new Production55_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}