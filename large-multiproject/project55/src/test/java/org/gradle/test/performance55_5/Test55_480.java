package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_480 {
    private final Production55_480 production = new Production55_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}