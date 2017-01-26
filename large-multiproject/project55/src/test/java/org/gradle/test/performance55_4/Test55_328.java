package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_328 {
    private final Production55_328 production = new Production55_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}