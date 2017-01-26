package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_391 {
    private final Production55_391 production = new Production55_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}