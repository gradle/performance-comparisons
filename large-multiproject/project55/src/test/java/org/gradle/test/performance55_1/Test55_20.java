package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_20 {
    private final Production55_20 production = new Production55_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}