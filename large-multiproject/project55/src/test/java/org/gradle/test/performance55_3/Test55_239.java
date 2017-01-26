package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_239 {
    private final Production55_239 production = new Production55_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}