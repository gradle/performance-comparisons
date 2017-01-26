package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_298 {
    private final Production55_298 production = new Production55_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}