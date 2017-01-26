package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_327 {
    private final Production55_327 production = new Production55_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}