package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_205 {
    private final Production55_205 production = new Production55_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}