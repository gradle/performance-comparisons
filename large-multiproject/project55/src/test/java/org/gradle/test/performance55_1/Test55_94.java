package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_94 {
    private final Production55_94 production = new Production55_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}