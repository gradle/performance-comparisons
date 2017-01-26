package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_280 {
    private final Production55_280 production = new Production55_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}