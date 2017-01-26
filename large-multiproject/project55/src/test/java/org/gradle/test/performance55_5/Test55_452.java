package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_452 {
    private final Production55_452 production = new Production55_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}