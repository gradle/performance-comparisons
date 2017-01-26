package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_180 {
    private final Production55_180 production = new Production55_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}