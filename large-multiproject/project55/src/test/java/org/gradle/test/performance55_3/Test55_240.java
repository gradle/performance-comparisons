package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_240 {
    private final Production55_240 production = new Production55_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}