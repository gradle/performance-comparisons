package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_453 {
    private final Production55_453 production = new Production55_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}