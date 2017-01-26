package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_52 {
    private final Production55_52 production = new Production55_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}