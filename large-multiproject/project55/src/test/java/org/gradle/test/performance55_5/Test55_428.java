package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_428 {
    private final Production55_428 production = new Production55_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}