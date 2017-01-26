package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_127 {
    private final Production55_127 production = new Production55_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}