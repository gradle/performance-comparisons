package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_352 {
    private final Production55_352 production = new Production55_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}