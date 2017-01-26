package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_384 {
    private final Production55_384 production = new Production55_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}