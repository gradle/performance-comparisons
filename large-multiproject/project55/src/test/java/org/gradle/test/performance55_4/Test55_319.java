package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_319 {
    private final Production55_319 production = new Production55_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}