package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_341 {
    private final Production55_341 production = new Production55_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}