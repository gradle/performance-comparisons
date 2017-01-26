package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_349 {
    private final Production55_349 production = new Production55_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}