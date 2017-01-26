package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_103 {
    private final Production55_103 production = new Production55_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}