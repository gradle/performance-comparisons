package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_485 {
    private final Production55_485 production = new Production55_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}