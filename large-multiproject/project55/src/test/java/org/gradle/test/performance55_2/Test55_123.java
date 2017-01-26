package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_123 {
    private final Production55_123 production = new Production55_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}