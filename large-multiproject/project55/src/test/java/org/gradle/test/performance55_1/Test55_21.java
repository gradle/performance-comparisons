package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_21 {
    private final Production55_21 production = new Production55_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}