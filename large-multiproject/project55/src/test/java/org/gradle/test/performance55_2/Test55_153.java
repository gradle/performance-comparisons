package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_153 {
    private final Production55_153 production = new Production55_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}