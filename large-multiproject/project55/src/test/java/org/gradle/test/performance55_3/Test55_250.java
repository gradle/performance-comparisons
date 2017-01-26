package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_250 {
    private final Production55_250 production = new Production55_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}