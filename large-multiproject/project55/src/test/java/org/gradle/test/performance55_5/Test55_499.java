package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_499 {
    private final Production55_499 production = new Production55_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}