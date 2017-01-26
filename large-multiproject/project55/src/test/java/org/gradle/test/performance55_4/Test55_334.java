package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_334 {
    private final Production55_334 production = new Production55_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}