package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_332 {
    private final Production55_332 production = new Production55_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}