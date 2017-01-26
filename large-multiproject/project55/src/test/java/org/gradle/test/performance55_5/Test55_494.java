package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_494 {
    private final Production55_494 production = new Production55_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}