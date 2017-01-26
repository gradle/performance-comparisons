package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_433 {
    private final Production55_433 production = new Production55_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}