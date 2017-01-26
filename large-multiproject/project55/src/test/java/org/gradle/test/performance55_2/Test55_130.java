package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_130 {
    private final Production55_130 production = new Production55_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}