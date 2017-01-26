package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_375 {
    private final Production55_375 production = new Production55_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}