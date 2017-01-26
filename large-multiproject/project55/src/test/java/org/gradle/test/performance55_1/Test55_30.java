package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_30 {
    private final Production55_30 production = new Production55_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}