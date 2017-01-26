package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_438 {
    private final Production55_438 production = new Production55_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}