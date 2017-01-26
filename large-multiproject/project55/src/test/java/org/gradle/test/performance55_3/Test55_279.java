package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_279 {
    private final Production55_279 production = new Production55_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}