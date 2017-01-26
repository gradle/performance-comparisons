package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_410 {
    private final Production55_410 production = new Production55_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}