package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_174 {
    private final Production55_174 production = new Production55_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}