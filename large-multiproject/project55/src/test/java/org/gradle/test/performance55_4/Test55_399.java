package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_399 {
    private final Production55_399 production = new Production55_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}