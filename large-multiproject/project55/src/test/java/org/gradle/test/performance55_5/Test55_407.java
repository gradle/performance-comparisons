package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_407 {
    private final Production55_407 production = new Production55_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}