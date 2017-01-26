package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_345 {
    private final Production55_345 production = new Production55_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}