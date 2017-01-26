package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_376 {
    private final Production55_376 production = new Production55_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}