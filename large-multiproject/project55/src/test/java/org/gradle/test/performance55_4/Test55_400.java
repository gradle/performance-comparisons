package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_400 {
    private final Production55_400 production = new Production55_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}