package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_55 {
    private final Production55_55 production = new Production55_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}