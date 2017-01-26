package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_374 {
    private final Production55_374 production = new Production55_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}