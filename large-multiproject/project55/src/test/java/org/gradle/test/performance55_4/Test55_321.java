package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_321 {
    private final Production55_321 production = new Production55_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}