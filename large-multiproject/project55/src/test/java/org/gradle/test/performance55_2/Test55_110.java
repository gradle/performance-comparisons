package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_110 {
    private final Production55_110 production = new Production55_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}