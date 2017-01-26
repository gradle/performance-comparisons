package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_133 {
    private final Production55_133 production = new Production55_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}