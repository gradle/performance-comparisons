package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_177 {
    private final Production55_177 production = new Production55_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}