package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_169 {
    private final Production55_169 production = new Production55_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}