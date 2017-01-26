package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_412 {
    private final Production55_412 production = new Production55_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}