package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_292 {
    private final Production55_292 production = new Production55_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}