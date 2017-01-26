package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_299 {
    private final Production55_299 production = new Production55_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}