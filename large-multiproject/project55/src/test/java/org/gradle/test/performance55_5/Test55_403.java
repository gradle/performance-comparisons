package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_403 {
    private final Production55_403 production = new Production55_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}