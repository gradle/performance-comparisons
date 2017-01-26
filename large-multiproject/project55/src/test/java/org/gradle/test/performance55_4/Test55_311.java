package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_311 {
    private final Production55_311 production = new Production55_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}