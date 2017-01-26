package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_211 {
    private final Production55_211 production = new Production55_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}