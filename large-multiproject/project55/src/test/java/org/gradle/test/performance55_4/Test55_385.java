package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_385 {
    private final Production55_385 production = new Production55_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}