package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_491 {
    private final Production55_491 production = new Production55_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}