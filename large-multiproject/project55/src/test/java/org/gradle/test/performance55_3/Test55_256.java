package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_256 {
    private final Production55_256 production = new Production55_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}