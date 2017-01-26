package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_434 {
    private final Production55_434 production = new Production55_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}