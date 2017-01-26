package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_17 {
    private final Production55_17 production = new Production55_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}