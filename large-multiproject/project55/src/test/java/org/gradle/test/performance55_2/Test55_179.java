package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_179 {
    private final Production55_179 production = new Production55_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}