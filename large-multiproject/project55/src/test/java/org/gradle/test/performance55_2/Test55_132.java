package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_132 {
    private final Production55_132 production = new Production55_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}