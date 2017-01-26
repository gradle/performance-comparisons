package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_333 {
    private final Production55_333 production = new Production55_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}