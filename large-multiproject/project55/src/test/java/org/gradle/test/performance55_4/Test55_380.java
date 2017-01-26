package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_380 {
    private final Production55_380 production = new Production55_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}