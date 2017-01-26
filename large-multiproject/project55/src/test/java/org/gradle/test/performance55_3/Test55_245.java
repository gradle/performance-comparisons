package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_245 {
    private final Production55_245 production = new Production55_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}