package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_101 {
    private final Production55_101 production = new Production55_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}