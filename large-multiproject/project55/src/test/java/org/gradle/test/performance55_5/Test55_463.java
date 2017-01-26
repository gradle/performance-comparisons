package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_463 {
    private final Production55_463 production = new Production55_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}