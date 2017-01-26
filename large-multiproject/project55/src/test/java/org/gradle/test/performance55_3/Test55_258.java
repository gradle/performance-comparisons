package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_258 {
    private final Production55_258 production = new Production55_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}