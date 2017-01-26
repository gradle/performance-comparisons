package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_221 {
    private final Production55_221 production = new Production55_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}