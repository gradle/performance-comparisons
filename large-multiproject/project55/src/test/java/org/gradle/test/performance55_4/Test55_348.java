package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_348 {
    private final Production55_348 production = new Production55_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}