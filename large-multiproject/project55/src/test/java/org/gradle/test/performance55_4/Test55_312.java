package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_312 {
    private final Production55_312 production = new Production55_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}