package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_340 {
    private final Production55_340 production = new Production55_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}