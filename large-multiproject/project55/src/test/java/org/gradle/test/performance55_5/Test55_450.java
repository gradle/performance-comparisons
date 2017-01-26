package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_450 {
    private final Production55_450 production = new Production55_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}