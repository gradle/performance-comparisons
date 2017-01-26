package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_233 {
    private final Production55_233 production = new Production55_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}