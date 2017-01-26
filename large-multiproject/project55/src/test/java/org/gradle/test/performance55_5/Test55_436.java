package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_436 {
    private final Production55_436 production = new Production55_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}