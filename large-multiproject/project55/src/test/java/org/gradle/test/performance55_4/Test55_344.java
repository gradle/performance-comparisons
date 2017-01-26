package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_344 {
    private final Production55_344 production = new Production55_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}