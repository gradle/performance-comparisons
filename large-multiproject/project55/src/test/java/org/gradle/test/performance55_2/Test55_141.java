package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_141 {
    private final Production55_141 production = new Production55_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}