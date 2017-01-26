package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_284 {
    private final Production55_284 production = new Production55_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}