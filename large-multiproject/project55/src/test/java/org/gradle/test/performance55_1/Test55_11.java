package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_11 {
    private final Production55_11 production = new Production55_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}