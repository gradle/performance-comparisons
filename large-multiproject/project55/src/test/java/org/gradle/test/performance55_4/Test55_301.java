package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_301 {
    private final Production55_301 production = new Production55_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}