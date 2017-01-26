package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_459 {
    private final Production55_459 production = new Production55_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}