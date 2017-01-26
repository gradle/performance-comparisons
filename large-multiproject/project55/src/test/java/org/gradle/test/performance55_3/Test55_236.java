package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_236 {
    private final Production55_236 production = new Production55_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}