package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_131 {
    private final Production55_131 production = new Production55_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}