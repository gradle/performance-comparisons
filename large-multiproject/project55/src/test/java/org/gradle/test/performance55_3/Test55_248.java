package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_248 {
    private final Production55_248 production = new Production55_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}