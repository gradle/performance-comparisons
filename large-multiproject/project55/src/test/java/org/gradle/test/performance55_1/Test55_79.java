package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_79 {
    private final Production55_79 production = new Production55_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}