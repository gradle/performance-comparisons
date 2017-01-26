package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_160 {
    private final Production55_160 production = new Production55_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}