package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_354 {
    private final Production55_354 production = new Production55_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}