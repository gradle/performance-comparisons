package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_472 {
    private final Production55_472 production = new Production55_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}