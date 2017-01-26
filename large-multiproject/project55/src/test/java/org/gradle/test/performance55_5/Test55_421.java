package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_421 {
    private final Production55_421 production = new Production55_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}