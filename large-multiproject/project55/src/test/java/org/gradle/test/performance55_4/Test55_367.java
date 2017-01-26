package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_367 {
    private final Production55_367 production = new Production55_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}