package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_446 {
    private final Production55_446 production = new Production55_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}