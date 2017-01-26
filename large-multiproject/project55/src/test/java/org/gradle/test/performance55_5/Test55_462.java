package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_462 {
    private final Production55_462 production = new Production55_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}