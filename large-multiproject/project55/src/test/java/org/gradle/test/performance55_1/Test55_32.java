package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_32 {
    private final Production55_32 production = new Production55_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}