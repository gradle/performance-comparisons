package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_184 {
    private final Production55_184 production = new Production55_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}