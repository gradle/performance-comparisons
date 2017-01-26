package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_456 {
    private final Production55_456 production = new Production55_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}