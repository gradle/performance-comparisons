package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_420 {
    private final Production55_420 production = new Production55_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}