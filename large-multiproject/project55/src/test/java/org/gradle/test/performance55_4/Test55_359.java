package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_359 {
    private final Production55_359 production = new Production55_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}