package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_414 {
    private final Production55_414 production = new Production55_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}