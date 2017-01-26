package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_197 {
    private final Production55_197 production = new Production55_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}