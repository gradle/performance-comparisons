package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_22 {
    private final Production55_22 production = new Production55_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}