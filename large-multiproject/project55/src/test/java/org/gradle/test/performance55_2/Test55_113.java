package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_113 {
    private final Production55_113 production = new Production55_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}