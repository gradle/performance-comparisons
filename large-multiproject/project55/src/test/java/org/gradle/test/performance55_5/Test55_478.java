package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_478 {
    private final Production55_478 production = new Production55_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}