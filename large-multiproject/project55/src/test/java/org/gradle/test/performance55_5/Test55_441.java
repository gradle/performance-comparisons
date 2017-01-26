package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_441 {
    private final Production55_441 production = new Production55_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}