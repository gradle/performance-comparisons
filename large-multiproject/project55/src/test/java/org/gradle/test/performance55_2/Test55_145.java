package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_145 {
    private final Production55_145 production = new Production55_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}