package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_473 {
    private final Production55_473 production = new Production55_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}