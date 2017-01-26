package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_149 {
    private final Production55_149 production = new Production55_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}