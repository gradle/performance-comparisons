package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_223 {
    private final Production55_223 production = new Production55_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}