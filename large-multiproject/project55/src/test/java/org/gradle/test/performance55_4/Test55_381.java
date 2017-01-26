package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_381 {
    private final Production55_381 production = new Production55_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}