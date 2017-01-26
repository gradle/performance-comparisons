package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_285 {
    private final Production55_285 production = new Production55_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}