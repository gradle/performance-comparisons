package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_454 {
    private final Production55_454 production = new Production55_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}