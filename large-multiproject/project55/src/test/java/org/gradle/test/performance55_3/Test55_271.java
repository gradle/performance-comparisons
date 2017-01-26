package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_271 {
    private final Production55_271 production = new Production55_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}